// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.liveeditprotocol;

/**
 * An accessor to dynamic implementation of LiveEdit protocol parser. Should be replaceable with
 * a similar class that provides access to generated parser implementation.
 */
public class LiveEditProtocolParserAccess {
  public static LiveEditProtocolParser get() {
    return PARSER;
  }

  private static final LiveEditProtocolParser PARSER =
      LiveEditDynamicParser.create().getParserRoot();
}
