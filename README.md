# ARCore-CloudAnchors

***This repository contains the code for the Android app to Save and Retrieve Augmented Reality Anchors using ARCore and Local Storage / Firebase.***

# Requirements

**1.** Existing Google account with a Credit Card for Billing purposes.

**2.** Android Studio (Latest Version)

**3.** Java (Latest Version)

**4.** Two Android Phones [Latest Android OS]

**NOTE: This app has been tested on Pixel XL and Pixel 2XL with Android P and Android O OS.**

# Usage

## Just give me the APK

To directly download and install the APK, click the following links to download. Once download is complete, install the app on your phone.

**Apk-1: Cloud Anchors with Raw Cloud ID and Local Storage**

[Complete_Cloud_ID_App](https://github.com/anujdutt9/ARCore-CloudAnchors/blob/master/APK/CompleteCloudIDApp/cloud_anchor_unique_id.apk)

**Apk-2: Cloud Anchors with Local Storage and Custom (Shortened) Cloud ID**

[Local_save_and_retrieve](https://github.com/anujdutt9/ARCore-CloudAnchors/blob/master/APK/LocalStorage/save_and_retrieve_ar.apk)

**Apk-3: Cloud Anchors using Firebase and Multiple Phones**

[Final_app](https://github.com/anujdutt9/ARCore-CloudAnchors/blob/master/APK/FinalApp/cloudAnchorsFirebase.apk)

## Do your own Implementation

If you want to do your own exploration and would like to have an app that you can just connect to Firebase and make it work, then you can get the complete code for "Cloud Anchors" with Firebase Integration in this file:

```
AR-Cloud-Anchors
```

To make this work,

**1.** Open the "AR-Cloud-Anchors" project in Android Studio.

**2.** Clean the project and Rebuild. **Note** that since this does not contains a Firebase connection yet, you need to do that.

**3.** Add your API Key in "Android_Manifest.xml" file under app view. Instructions to get API Keys [here](https://support.google.com/cloud/answer/6158862?ref_topic=6262490).

**4.** Enable ARCore API for your project from [here](https://console.cloud.google.com/apis/library/arcorecloudanchor.googleapis.com/?pli=1&project=mythical-sky-186414&folder&organizationId).

**5.** To connect your app to Firebase, go to "Tools -> Firebase". Click on "RealTime Database -> Save and Retrieve Data". 

**6.** Click on Step-1 to connect to Firebase. Click on Step-2 to add dependencies in your app for Firebase.

**7.** In Step-3, click on "configure your rules for public access" to see a sample of configuration you need to make in Firebase.

**8.** Once this is done, go to your [Firebase Console](https://console.firebase.google.com/) and click on "Develop -> Database".

**9.** Click "Get Started" to configure and setup the Realtime Database.

**10.** Select the "Test Mode" security rules and click "ENABLE".

**11.** Your app is now configured in Firebase.

# Test Your App

To test the working of the app, follow the following steps:

**1.** Open the app on one phone with WiFi connection.

**2.** Scan the area until you get some good amount of area covered by the mesh using ARCore.

**3.** Tap anywhere on the screen in the area of mesh made by ARCore. You will see that an Android Appears in the scene.

**4.** Wear headphones connected to phone over bluetooth to experience the 3-D Binaural Audio emerging from the Android AR Object/Anchor.

**5.** Keep an eye on the phone screen at bottom as it saves the features with anchor position to Firebase and provides you with an easy to remember unique number. Remember this number.

**6.** Close the application on the phone once you have the unique number (Cloud ID).

**7.** Open the app on a different phone and click on "Resolve" button. Enter the number you got from hosting the AR Object, enter it into the place provided and click on OK.

**8.** Scan the same place where the other person place the AR Object/Anchor. 

**9.** Magically, the Android (AR Anchor) appears in front of you in the scene at the same place and with same orientation in which the first user placed it.

**10.** Now open the app on the other phone as well and enter the Cloud ID by clicking on "Resolve".

**11.** Scan the area again and magically Android appears in the scene again. **Note** that now 2 people are watching the same AR Object from different positions but the AR Anchor remains in the same position and orientation as initially placed.
