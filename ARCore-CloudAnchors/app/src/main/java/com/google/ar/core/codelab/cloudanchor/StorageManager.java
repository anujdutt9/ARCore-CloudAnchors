package com.google.ar.core.codelab.cloudanchor;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

// Class to Save the Unique Cloud Anchor ID in Local Storage for Persistence
public class StorageManager {
    private static final String NEXT_SHORT_CODE = "next_short_code";
    private static final String KEY_PREFIX = "anchor;";
    private static final int INITIAL_SHORT_CODE = 142;


    /** Gets a new short code that can be used to store the anchor ID. */
    int nextShortCode(Activity activity) {
        SharedPreferences sharedPrefs = activity.getPreferences(Context.MODE_PRIVATE);
        int shortCode = sharedPrefs.getInt(NEXT_SHORT_CODE, INITIAL_SHORT_CODE);
        // Increment and update the value in sharedPrefs, so the next code retrieved will be unused.
        sharedPrefs.edit().putInt(NEXT_SHORT_CODE, shortCode + 1)
                .apply();
        return shortCode;
    }


    /** Stores the cloud anchor ID in the activity's SharedPrefernces. */
    void storeUsingShortCode(Activity activity, int shortCode, String cloudAnchorId) {
        SharedPreferences sharedPrefs = activity.getPreferences(Context.MODE_PRIVATE);
        sharedPrefs.edit().putString(KEY_PREFIX + shortCode, cloudAnchorId).apply();
    }


    /**
     * Retrieves the cloud anchor ID using a short code. Returns an empty string if a cloud anchor ID
     * was not stored for this short code.
     */
    String getCloudAnchorID(Activity activity, int shortCode) {
        SharedPreferences sharedPrefs = activity.getPreferences(Context.MODE_PRIVATE);
        return sharedPrefs.getString(KEY_PREFIX + shortCode, "");
    }
}
