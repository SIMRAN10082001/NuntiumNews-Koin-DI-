// Generated by view binder compiler. Do not edit!
package com.application.nuntium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.application.nuntium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeCategoryChipBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout cardHomeChip;

  @NonNull
  public final TextView textCategories;

  private HomeCategoryChipBinding(@NonNull CardView rootView, @NonNull LinearLayout cardHomeChip,
      @NonNull TextView textCategories) {
    this.rootView = rootView;
    this.cardHomeChip = cardHomeChip;
    this.textCategories = textCategories;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeCategoryChipBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeCategoryChipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_category_chip, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeCategoryChipBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_home_chip;
      LinearLayout cardHomeChip = ViewBindings.findChildViewById(rootView, id);
      if (cardHomeChip == null) {
        break missingId;
      }

      id = R.id.text_categories;
      TextView textCategories = ViewBindings.findChildViewById(rootView, id);
      if (textCategories == null) {
        break missingId;
      }

      return new HomeCategoryChipBinding((CardView) rootView, cardHomeChip, textCategories);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}