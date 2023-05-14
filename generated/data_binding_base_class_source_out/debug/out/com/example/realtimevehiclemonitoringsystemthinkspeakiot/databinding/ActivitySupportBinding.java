// Generated by view binder compiler. Do not edit!
package com.example.realtimevehiclemonitoringsystemthinkspeakiot.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.realtimevehiclemonitoringsystemthinkspeakiot.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySupportBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText desc;

  @NonNull
  public final TextView email;

  @NonNull
  public final EditText emailId;

  @NonNull
  public final TextView header;

  @NonNull
  public final TextView heading;

  @NonNull
  public final TextView iss;

  @NonNull
  public final TextView mob;

  @NonNull
  public final EditText mobileNumber;

  @NonNull
  public final AppCompatButton register;

  @NonNull
  public final TextView veh;

  @NonNull
  public final EditText vehicleDetails;

  private ActivitySupportBinding(@NonNull RelativeLayout rootView, @NonNull EditText desc,
      @NonNull TextView email, @NonNull EditText emailId, @NonNull TextView header,
      @NonNull TextView heading, @NonNull TextView iss, @NonNull TextView mob,
      @NonNull EditText mobileNumber, @NonNull AppCompatButton register, @NonNull TextView veh,
      @NonNull EditText vehicleDetails) {
    this.rootView = rootView;
    this.desc = desc;
    this.email = email;
    this.emailId = emailId;
    this.header = header;
    this.heading = heading;
    this.iss = iss;
    this.mob = mob;
    this.mobileNumber = mobileNumber;
    this.register = register;
    this.veh = veh;
    this.vehicleDetails = vehicleDetails;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySupportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySupportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_support, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySupportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.desc;
      EditText desc = ViewBindings.findChildViewById(rootView, id);
      if (desc == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.emailId;
      EditText emailId = ViewBindings.findChildViewById(rootView, id);
      if (emailId == null) {
        break missingId;
      }

      id = R.id.header;
      TextView header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.heading;
      TextView heading = ViewBindings.findChildViewById(rootView, id);
      if (heading == null) {
        break missingId;
      }

      id = R.id.iss;
      TextView iss = ViewBindings.findChildViewById(rootView, id);
      if (iss == null) {
        break missingId;
      }

      id = R.id.mob;
      TextView mob = ViewBindings.findChildViewById(rootView, id);
      if (mob == null) {
        break missingId;
      }

      id = R.id.mobile_number;
      EditText mobileNumber = ViewBindings.findChildViewById(rootView, id);
      if (mobileNumber == null) {
        break missingId;
      }

      id = R.id.register;
      AppCompatButton register = ViewBindings.findChildViewById(rootView, id);
      if (register == null) {
        break missingId;
      }

      id = R.id.veh;
      TextView veh = ViewBindings.findChildViewById(rootView, id);
      if (veh == null) {
        break missingId;
      }

      id = R.id.vehicle_details;
      EditText vehicleDetails = ViewBindings.findChildViewById(rootView, id);
      if (vehicleDetails == null) {
        break missingId;
      }

      return new ActivitySupportBinding((RelativeLayout) rootView, desc, email, emailId, header,
          heading, iss, mob, mobileNumber, register, veh, vehicleDetails);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}