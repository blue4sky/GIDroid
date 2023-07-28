// Generated by view binder compiler. Do not edit!
package acr.browser.lightning.databinding;

import acr.browser.lightning.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogManualProxyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText proxyHost;

  @NonNull
  public final EditText proxyPort;

  private DialogManualProxyBinding(@NonNull LinearLayout rootView, @NonNull EditText proxyHost,
      @NonNull EditText proxyPort) {
    this.rootView = rootView;
    this.proxyHost = proxyHost;
    this.proxyPort = proxyPort;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogManualProxyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogManualProxyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_manual_proxy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogManualProxyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.proxyHost;
      EditText proxyHost = ViewBindings.findChildViewById(rootView, id);
      if (proxyHost == null) {
        break missingId;
      }

      id = R.id.proxyPort;
      EditText proxyPort = ViewBindings.findChildViewById(rootView, id);
      if (proxyPort == null) {
        break missingId;
      }

      return new DialogManualProxyBinding((LinearLayout) rootView, proxyHost, proxyPort);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}