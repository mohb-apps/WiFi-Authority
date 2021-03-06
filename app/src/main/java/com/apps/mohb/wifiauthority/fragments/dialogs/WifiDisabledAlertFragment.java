/*
 *  Copyright (c) 2020 mohb apps - All Rights Reserved
 *
 *  Project       : WiFiAuthority
 *  Developer     : Haraldo Albergaria Filho, a.k.a. mohb apps
 *
 *  File          : WifiDisabledAlertFragment.java
 *  Last modified : 10/1/20 1:33 AM
 *
 *  -----------------------------------------------------------
 */

package com.apps.mohb.wifiauthority.fragments.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.apps.mohb.wifiauthority.R;


public class WifiDisabledAlertFragment extends DialogFragment {

    public interface WifiDisabledDialogListener {
        void onAlertWifiDisabledDialogPositiveClick(DialogFragment dialog);

        void onAlertWifiDisabledDialogNegativeClick(DialogFragment dialog);
    }

    private WifiDisabledDialogListener mListener;


    @NonNull
    @Override
    public AlertDialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setTitle(R.string.alert_title_wifi_disabled).setMessage(R.string.alert_message_wifi_disabled)
                .setPositiveButton(R.string.alert_button_yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        mListener.onAlertWifiDisabledDialogPositiveClick(WifiDisabledAlertFragment.this);
                    }
                })
                .setNegativeButton(R.string.alert_button_close_app, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        mListener.onAlertWifiDisabledDialogNegativeClick(WifiDisabledAlertFragment.this);
                    }
                });

        return alertDialogBuilder.create();

    }

    @Override
    public void onCancel(@NonNull DialogInterface dialog) {
        super.onCancel(dialog);
        mListener.onAlertWifiDisabledDialogNegativeClick(this);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // Verify that the host activity implements the callback interface
        try {
            // Instantiate the WifiDisabledDialogListener so we can send events to the host
            mListener = (WifiDisabledDialogListener) context;
        } catch (ClassCastException e) {
            // The activity doesn't implement the interface, throw exception
            throw new ClassCastException(context.toString()
                    + " must implement WifiDisabledDialogListener");
        }
    }

}