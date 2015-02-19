// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.utils.v201409;

import com.google.api.ads.adwords.lib.jaxb.v201409.DownloadFormat;
import com.google.api.ads.adwords.lib.utils.ReportRequest;
import com.google.common.base.Preconditions;

/**
 * ReportRequest for AWQL reports.
 * 
 * @author Josh Radcliff
 */
class AwqlReportRequest implements ReportRequest {

  private final String awqlQuery;
  private final DownloadFormat downloadFormat;

  public AwqlReportRequest(String awqlQuery, DownloadFormat downloadFormat) {
    this.awqlQuery = Preconditions.checkNotNull(awqlQuery, "Null AWQL query");
    this.downloadFormat = Preconditions.checkNotNull(downloadFormat, "Null download format");
  }

  public String getReportRequestString() {
    return awqlQuery;
  }

  public DownloadFormat getDownloadFormat() {
    return downloadFormat;
  }

  public RequestType getRequestType() {
    return RequestType.AWQL;
  }
}