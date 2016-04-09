/*
 * Copyright (C) 2014 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.services.application;

import org.opendatakit.common.android.application.AppAwareApplication;
import org.opendatakit.common.android.logic.PropertiesSingleton;
import org.opendatakit.services.R;

public class Services extends AppAwareApplication {

  private static Services singleton = null;

  @Override public int getApkDisplayNameResourceId() {
    return R.string.app_name;
  }

  @Override
  public void onCreate() {
    if (singleton == null) {
      PropertiesSingleton.setToolStartedProperty(this.getBaseContext(), this.getToolName());
    }
    singleton = this;

    super.onCreate();
  }

}
