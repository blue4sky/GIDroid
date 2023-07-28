// Generated by view binder compiler. Do not edit!
package com.aaronjwood.portauthority.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import com.aaronjwood.portauthority.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final TextView bssid;

  @NonNull
  public final TextView bssidLabel;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final TableLayout deviceInfo;

  @NonNull
  public final TextView deviceMacAddress;

  @NonNull
  public final TextView deviceMacAddressLabel;

  @NonNull
  public final TextView deviceMacVendor;

  @NonNull
  public final TextView deviceMacVendorLabel;

  @NonNull
  public final Button discoverHosts;

  @NonNull
  public final TextView externalIpAddress;

  @NonNull
  public final TextView externalIpAddressLabel;

  @NonNull
  public final ListView hostList;

  @NonNull
  public final TextView internalIpAddress;

  @NonNull
  public final TextView internalIpAddressLabel;

  @NonNull
  public final DrawerLayout leftDrawer;

  @NonNull
  public final ImageView leftDrawerIcon;

  @NonNull
  public final RelativeLayout leftDrawerLayout;

  @NonNull
  public final ListView lowerLeftDrawerList;

  @NonNull
  public final TextView programTitle;

  @NonNull
  public final TextView signalStrength;

  @NonNull
  public final TextView signalStrengthLabel;

  @NonNull
  public final TextView ssid;

  @NonNull
  public final TextView ssidLabel;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView textView;

  @NonNull
  public final ListView upperLeftDrawerList;

  private ActivityMainBinding(@NonNull DrawerLayout rootView, @NonNull TextView bssid,
      @NonNull TextView bssidLabel, @Nullable TableLayout deviceInfo,
      @NonNull TextView deviceMacAddress, @NonNull TextView deviceMacAddressLabel,
      @NonNull TextView deviceMacVendor, @NonNull TextView deviceMacVendorLabel,
      @NonNull Button discoverHosts, @NonNull TextView externalIpAddress,
      @NonNull TextView externalIpAddressLabel, @NonNull ListView hostList,
      @NonNull TextView internalIpAddress, @NonNull TextView internalIpAddressLabel,
      @NonNull DrawerLayout leftDrawer, @NonNull ImageView leftDrawerIcon,
      @NonNull RelativeLayout leftDrawerLayout, @NonNull ListView lowerLeftDrawerList,
      @NonNull TextView programTitle, @NonNull TextView signalStrength,
      @NonNull TextView signalStrengthLabel, @NonNull TextView ssid, @NonNull TextView ssidLabel,
      @Nullable TextView textView, @NonNull ListView upperLeftDrawerList) {
    this.rootView = rootView;
    this.bssid = bssid;
    this.bssidLabel = bssidLabel;
    this.deviceInfo = deviceInfo;
    this.deviceMacAddress = deviceMacAddress;
    this.deviceMacAddressLabel = deviceMacAddressLabel;
    this.deviceMacVendor = deviceMacVendor;
    this.deviceMacVendorLabel = deviceMacVendorLabel;
    this.discoverHosts = discoverHosts;
    this.externalIpAddress = externalIpAddress;
    this.externalIpAddressLabel = externalIpAddressLabel;
    this.hostList = hostList;
    this.internalIpAddress = internalIpAddress;
    this.internalIpAddressLabel = internalIpAddressLabel;
    this.leftDrawer = leftDrawer;
    this.leftDrawerIcon = leftDrawerIcon;
    this.leftDrawerLayout = leftDrawerLayout;
    this.lowerLeftDrawerList = lowerLeftDrawerList;
    this.programTitle = programTitle;
    this.signalStrength = signalStrength;
    this.signalStrengthLabel = signalStrengthLabel;
    this.ssid = ssid;
    this.ssidLabel = ssidLabel;
    this.textView = textView;
    this.upperLeftDrawerList = upperLeftDrawerList;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
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
      id = R.id.bssid;
      TextView bssid = rootView.findViewById(id);
      if (bssid == null) {
        break missingId;
      }

      id = R.id.bssidLabel;
      TextView bssidLabel = rootView.findViewById(id);
      if (bssidLabel == null) {
        break missingId;
      }

      id = R.id.deviceInfo;
      TableLayout deviceInfo = rootView.findViewById(id);

      id = R.id.deviceMacAddress;
      TextView deviceMacAddress = rootView.findViewById(id);
      if (deviceMacAddress == null) {
        break missingId;
      }

      id = R.id.deviceMacAddressLabel;
      TextView deviceMacAddressLabel = rootView.findViewById(id);
      if (deviceMacAddressLabel == null) {
        break missingId;
      }

      id = R.id.deviceMacVendor;
      TextView deviceMacVendor = rootView.findViewById(id);
      if (deviceMacVendor == null) {
        break missingId;
      }

      id = R.id.deviceMacVendorLabel;
      TextView deviceMacVendorLabel = rootView.findViewById(id);
      if (deviceMacVendorLabel == null) {
        break missingId;
      }

      id = R.id.discoverHosts;
      Button discoverHosts = rootView.findViewById(id);
      if (discoverHosts == null) {
        break missingId;
      }

      id = R.id.externalIpAddress;
      TextView externalIpAddress = rootView.findViewById(id);
      if (externalIpAddress == null) {
        break missingId;
      }

      id = R.id.externalIpAddressLabel;
      TextView externalIpAddressLabel = rootView.findViewById(id);
      if (externalIpAddressLabel == null) {
        break missingId;
      }

      id = R.id.hostList;
      ListView hostList = rootView.findViewById(id);
      if (hostList == null) {
        break missingId;
      }

      id = R.id.internalIpAddress;
      TextView internalIpAddress = rootView.findViewById(id);
      if (internalIpAddress == null) {
        break missingId;
      }

      id = R.id.internalIpAddressLabel;
      TextView internalIpAddressLabel = rootView.findViewById(id);
      if (internalIpAddressLabel == null) {
        break missingId;
      }

      DrawerLayout leftDrawer = (DrawerLayout) rootView;

      id = R.id.leftDrawerIcon;
      ImageView leftDrawerIcon = rootView.findViewById(id);
      if (leftDrawerIcon == null) {
        break missingId;
      }

      id = R.id.leftDrawerLayout;
      RelativeLayout leftDrawerLayout = rootView.findViewById(id);
      if (leftDrawerLayout == null) {
        break missingId;
      }

      id = R.id.lowerLeftDrawerList;
      ListView lowerLeftDrawerList = rootView.findViewById(id);
      if (lowerLeftDrawerList == null) {
        break missingId;
      }

      id = R.id.programTitle;
      TextView programTitle = rootView.findViewById(id);
      if (programTitle == null) {
        break missingId;
      }

      id = R.id.signalStrength;
      TextView signalStrength = rootView.findViewById(id);
      if (signalStrength == null) {
        break missingId;
      }

      id = R.id.signalStrengthLabel;
      TextView signalStrengthLabel = rootView.findViewById(id);
      if (signalStrengthLabel == null) {
        break missingId;
      }

      id = R.id.ssid;
      TextView ssid = rootView.findViewById(id);
      if (ssid == null) {
        break missingId;
      }

      id = R.id.ssidLabel;
      TextView ssidLabel = rootView.findViewById(id);
      if (ssidLabel == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);

      id = R.id.upperLeftDrawerList;
      ListView upperLeftDrawerList = rootView.findViewById(id);
      if (upperLeftDrawerList == null) {
        break missingId;
      }

      return new ActivityMainBinding((DrawerLayout) rootView, bssid, bssidLabel, deviceInfo,
          deviceMacAddress, deviceMacAddressLabel, deviceMacVendor, deviceMacVendorLabel,
          discoverHosts, externalIpAddress, externalIpAddressLabel, hostList, internalIpAddress,
          internalIpAddressLabel, leftDrawer, leftDrawerIcon, leftDrawerLayout, lowerLeftDrawerList,
          programTitle, signalStrength, signalStrengthLabel, ssid, ssidLabel, textView,
          upperLeftDrawerList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}