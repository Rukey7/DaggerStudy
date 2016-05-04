package com.dl7.daggerstudy.activity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.dl7.androidlib.activity.BaseActivity;
import com.dl7.daggerstudy.R;

/**
 * Created by long on 2016/5/3.
 */
public abstract class BaseMarketActivity extends BaseActivity {

    private boolean mHideSearchView = false;


    protected void hideSearchView() {
        mHideSearchView = true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.market_toolbar, menu);
        if (mHideSearchView) {
            menu.removeItem(R.id.m_search);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m_search:
                Log.e("BaseMarketActivity", "m_search");
                break;
            case R.id.m_download:
                Log.e("BaseMarketActivity", "m_download");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
