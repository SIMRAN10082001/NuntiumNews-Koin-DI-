// Generated by view binder compiler. Do not edit!
package com.application.nuntium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.application.nuntium.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SourceFileBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView category;

  @NonNull
  public final MaterialCardView categoryCard;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView language;

  @NonNull
  public final MaterialCardView languageCard;

  @NonNull
  public final TextView title;

  @NonNull
  public final ImageView web;

  private SourceFileBinding(@NonNull MaterialCardView rootView, @NonNull TextView category,
      @NonNull MaterialCardView categoryCard, @NonNull TextView description,
      @NonNull TextView language, @NonNull MaterialCardView languageCard, @NonNull TextView title,
      @NonNull ImageView web) {
    this.rootView = rootView;
    this.category = category;
    this.categoryCard = categoryCard;
    this.description = description;
    this.language = language;
    this.languageCard = languageCard;
    this.title = title;
    this.web = web;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static SourceFileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SourceFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.source_file, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SourceFileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category;
      TextView category = ViewBindings.findChildViewById(rootView, id);
      if (category == null) {
        break missingId;
      }

      id = R.id.category_card;
      MaterialCardView categoryCard = ViewBindings.findChildViewById(rootView, id);
      if (categoryCard == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.language;
      TextView language = ViewBindings.findChildViewById(rootView, id);
      if (language == null) {
        break missingId;
      }

      id = R.id.language_card;
      MaterialCardView languageCard = ViewBindings.findChildViewById(rootView, id);
      if (languageCard == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.web;
      ImageView web = ViewBindings.findChildViewById(rootView, id);
      if (web == null) {
        break missingId;
      }

      return new SourceFileBinding((MaterialCardView) rootView, category, categoryCard, description,
          language, languageCard, title, web);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}