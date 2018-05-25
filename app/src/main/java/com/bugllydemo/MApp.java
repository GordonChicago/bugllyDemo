package com.bugllydemo;

import com.tencent.bugly.Bugly;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by yibao on 2018/5/21.
 */

public class MApp extends TinkerApplication {

    public MApp() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.bugllydemo.MAppLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
