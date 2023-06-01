// Generated by view binder compiler. Do not edit!
package com.application.nuntium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.application.nuntium.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentUserBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton logoutBtn;

  @NonNull
  public final SwitchCompat mswitch;

  @NonNull
  public final TextView userEmail;

  @NonNull
  public final ShapeableImageView userImg;

  @NonNull
  public final TextView userName;

  private FragmentUserBinding(@NonNull LinearLayout rootView, @NonNull MaterialButton logoutBtn,
      @NonNull SwitchCompat mswitch, @NonNull TextView userEmail,
      @NonNull ShapeableImageView userImg, @NonNull TextView userName) {
    this.rootView = rootView;
    this.logoutBtn = logoutBtn;
    this.mswitch = mswitch;
    this.userEmail = userEmail;
    this.userImg = userImg;
    this.userName = userName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.logout_btn;
      MaterialButton logoutBtn = ViewBindings.findChildViewById(rootView, id);
      if (logoutBtn == null) {
        break missingId;
      }

      id = R.id.mswitch;
      SwitchCompat mswitch = ViewBindings.findChildViewById(rootView, id);
      if (mswitch == null) {
        break missingId;
      }

      id = R.id.user_email;
      TextView userEmail = ViewBindings.findChildViewById(rootView, id);
      if (userEmail == null) {
        break missingId;
      }

      id = R.id.user_img;
      ShapeableImageView userImg = ViewBindings.findChildViewById(rootView, id);
      if (userImg == null) {
        break missingId;
      }

      id = R.id.user_name;
      TextView userName = ViewBindings.findChildViewById(rootView, id);
      if (userName == null) {
        break missingId;
      }

      return new FragmentUserBinding((LinearLayout) rootView, logoutBtn, mswitch, userEmail,
          userImg, userName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
