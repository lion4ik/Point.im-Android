package org.itishka.pointim;

import org.itishka.pointim.api.ConnectionManager;
import org.itishka.pointim.api.data.PostList;

import retrofit.Callback;

/**
 * Created by Татьяна on 21.10.2014.
 */
public class RecentFragment extends PostListFragment {
    @Override
    protected void update(Callback<PostList> callback) {
        ConnectionManager.getInstance().pointService.getRecent(callback);
    }
}
