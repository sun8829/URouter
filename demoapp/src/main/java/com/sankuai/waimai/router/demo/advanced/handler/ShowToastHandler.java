package com.sankuai.waimai.router.demo.advanced.handler;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.sankuai.waimai.router.annotation.RouterUri;
import com.sankuai.waimai.router.core.UriCallback;
import com.sankuai.waimai.router.core.UriHandler;
import com.sankuai.waimai.router.core.UriRequest;
import com.sankuai.waimai.router.core.UriResult;
import com.sankuai.waimai.router.demo.lib2.DemoConstant;

@RouterUri(path = DemoConstant.SHOW_TOAST_HANDLER)
public class ShowToastHandler extends UriHandler {

    @Override
    protected boolean shouldHandle(@NonNull UriRequest request) {
        return true;
    }

    @Override
    protected void handleInternal(@NonNull UriRequest request, @NonNull UriCallback callback) {
        Toast.makeText(request.getContext(), "TestHandler", Toast.LENGTH_LONG).show();
        callback.onComplete(UriResult.CODE_SUCCESS);
    }
}