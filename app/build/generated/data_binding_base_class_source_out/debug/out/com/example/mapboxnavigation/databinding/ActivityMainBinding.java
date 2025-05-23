// Generated by view binder compiler. Do not edit!
package com.example.mapboxnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mapboxnavigation.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.mapbox.maps.MapView;
import com.mapbox.navigation.ui.voice.view.MapboxSoundButton;
import com.mapbox.search.ui.view.SearchResultsView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final FloatingActionButton focusLocation;

  @NonNull
  public final MapView mapView;

  @NonNull
  public final TextInputEditText searchET;

  @NonNull
  public final TextInputLayout searchLayout;

  @NonNull
  public final SearchResultsView searchResultsView;

  @NonNull
  public final MaterialButton setRoute;

  @NonNull
  public final MapboxSoundButton soundButton;

  private ActivityMainBinding(@NonNull RelativeLayout rootView,
      @NonNull FloatingActionButton focusLocation, @NonNull MapView mapView,
      @NonNull TextInputEditText searchET, @NonNull TextInputLayout searchLayout,
      @NonNull SearchResultsView searchResultsView, @NonNull MaterialButton setRoute,
      @NonNull MapboxSoundButton soundButton) {
    this.rootView = rootView;
    this.focusLocation = focusLocation;
    this.mapView = mapView;
    this.searchET = searchET;
    this.searchLayout = searchLayout;
    this.searchResultsView = searchResultsView;
    this.setRoute = setRoute;
    this.soundButton = soundButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.focusLocation;
      FloatingActionButton focusLocation = ViewBindings.findChildViewById(rootView, id);
      if (focusLocation == null) {
        break missingId;
      }

      id = R.id.mapView;
      MapView mapView = ViewBindings.findChildViewById(rootView, id);
      if (mapView == null) {
        break missingId;
      }

      id = R.id.searchET;
      TextInputEditText searchET = ViewBindings.findChildViewById(rootView, id);
      if (searchET == null) {
        break missingId;
      }

      id = R.id.searchLayout;
      TextInputLayout searchLayout = ViewBindings.findChildViewById(rootView, id);
      if (searchLayout == null) {
        break missingId;
      }

      id = R.id.search_results_view;
      SearchResultsView searchResultsView = ViewBindings.findChildViewById(rootView, id);
      if (searchResultsView == null) {
        break missingId;
      }

      id = R.id.setRoute;
      MaterialButton setRoute = ViewBindings.findChildViewById(rootView, id);
      if (setRoute == null) {
        break missingId;
      }

      id = R.id.soundButton;
      MapboxSoundButton soundButton = ViewBindings.findChildViewById(rootView, id);
      if (soundButton == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, focusLocation, mapView, searchET,
          searchLayout, searchResultsView, setRoute, soundButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
