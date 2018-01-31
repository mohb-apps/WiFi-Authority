/*
 *  Copyright (c) 2017 mohb apps - All Rights Reserved
 *
 *  Project       : WiFiAuthority
 *  Developer     : Haraldo Albergaria Filho, a.k.a. mohb apps
 *
 *  File          : Toasts.java
 *  Last modified : 8/21/17 11:20 PM
 *
 *  -----------------------------------------------------------
 */

package com.apps.mohb.wifiauthority;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;


/*
    This class manages all the toasts in the application
*/

public class Toasts {

    private static Toast unableAddNetwork;
    private static Toast unableRemoveNetwork;
    private static Toast unableToChangePassword;
    private static Toast noDetailedInformation;
    private static Toast networkIsConfigured;
    private static Toast networkConnectionError;
    private static Toast noNetworkFound;
    private static Toast legalNotices;
    private static Toast helpPage;

    private static Context context;


    public static void setContext(Context c) {
        context = c;
    }


    /*
         Toast to notify that there is no location information
    */

    public static void showNoDetailedInformation(Context c, int textId) {
        noDetailedInformation = Toast.makeText((c), textId, Toast.LENGTH_SHORT);
        noDetailedInformation.show();
    }

    public static void cancelNoDetailedInformation() {
        if (noDetailedInformation != null) {
            noDetailedInformation.cancel();
        }
    }


    /*
         Toast to notify that it is unable to add network
    */

    public static void showUnableAddNetwork(Context c) {
        unableAddNetwork = Toast.makeText((c), R.string.toast_unable_add_network, Toast.LENGTH_LONG);
        unableAddNetwork.setGravity(Gravity.CENTER, Constants.TOAST_X_OFFSET, Constants.TOAST_Y_OFFSET);
        unableAddNetwork.show();
    }

    public static void cancelUnableAddNetwork() {
        if (unableAddNetwork != null) {
            unableAddNetwork.cancel();
        }
    }

    /*
         Toast to notify that it is unable to remove network
    */

    public static void showUnableRemoveNetwork(Context c) {
        unableRemoveNetwork = Toast.makeText((c), R.string.toast_unable_remove_network, Toast.LENGTH_SHORT);
        unableRemoveNetwork.setGravity(Gravity.CENTER, Constants.TOAST_X_OFFSET, Constants.TOAST_Y_OFFSET);
        unableRemoveNetwork.show();
    }

    public static void cancelUnableRemoveNetwork() {
        if (unableRemoveNetwork != null) {
            unableRemoveNetwork.cancel();
        }
    }


    /*
         Toast to notify that it is unable to change password
    */

    public static void showUnableToChangePassword(Context c) {
        unableToChangePassword = Toast.makeText((c), R.string.toast_unable_to_change_password, Toast.LENGTH_SHORT);
        unableToChangePassword.setGravity(Gravity.CENTER, Constants.TOAST_X_OFFSET, Constants.TOAST_Y_OFFSET);
        unableToChangePassword.show();
    }

    public static void cancelUnableToChangePassword() {
        if (unableToChangePassword != null) {
            unableToChangePassword.cancel();
        }
    }


    /*
         Toast to notify that there is no network found or to display
    */

    public static void showNoNetworkFound(Context c, int textId) {
        noNetworkFound = Toast.makeText((c), textId, Toast.LENGTH_SHORT);
        noNetworkFound.setGravity(Gravity.CENTER, Constants.TOAST_X_OFFSET, Constants.TOAST_Y_OFFSET);
        noNetworkFound.show();
    }

    public static void cancelNoNetworkFound() {
        if (noNetworkFound != null) {
            noNetworkFound.cancel();
        }
    }


    /*
         Toast to notify that network is already configured
    */

    public static void showNetworkIsConfigured(Context c) {
        networkIsConfigured = Toast.makeText((c), R.string.toast_network_is_configured, Toast.LENGTH_SHORT);
        networkIsConfigured.setGravity(Gravity.CENTER, Constants.TOAST_X_OFFSET, Constants.TOAST_Y_OFFSET);
        networkIsConfigured.show();
    }

    public static void cancelNetworkIsConfigured() {
        if (networkIsConfigured != null) {
            networkIsConfigured.cancel();
        }
    }


    /*
         Toast to notify a network connection error
    */

    public static void showNetworkConnectionError(Context c, int textId) {
        networkConnectionError = Toast.makeText((c), textId, Toast.LENGTH_SHORT);
        networkConnectionError.show();
    }

    public static void cancelNetworkConnectionError() {
        if (networkConnectionError != null) {
            networkConnectionError.cancel();
        }
    }


    /*
         Toast to notify that is getting Legal Notices text from the internet
    */

    public static void createLegalNotices() {
        legalNotices = Toast.makeText((context), "", Toast.LENGTH_SHORT);
        legalNotices.setGravity(Gravity.CENTER, Constants.TOAST_X_OFFSET, Constants.TOAST_Y_OFFSET);
    }

    public static void setLegalNoticesText(int textId) {
        legalNotices.setText(textId);
    }

    public static void showLegalNotices() {
        legalNotices.show();
    }

    public static void cancelLegalNotices() {
        if (legalNotices != null) {
            legalNotices.cancel();
        }
    }


    /*
         Toast to notify that is getting an options_help page from the internet
    */

    public static void createHelpPage() {
        helpPage = Toast.makeText((context), R.string.toast_get_help_page, Toast.LENGTH_SHORT);
        helpPage.setGravity(Gravity.CENTER, Constants.TOAST_X_OFFSET, Constants.TOAST_Y_OFFSET);
    }

    public static void showHelpPage() {
        helpPage.show();
    }

    public static void cancelHelpPage() {
        if (helpPage != null) {
            helpPage.cancel();
        }
    }


    /*
         Cancel all toasts
    */

    public static void cancelAllToasts() {
        cancelUnableAddNetwork();
        cancelUnableRemoveNetwork();
        cancelUnableToChangePassword();
        cancelNetworkIsConfigured();
        cancelNetworkConnectionError();
        cancelNoNetworkFound();
        cancelNoDetailedInformation();
        cancelLegalNotices();
        cancelHelpPage();
    }

}