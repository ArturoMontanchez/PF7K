package montanchez.pf7k_v0_1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Arturo Montanchez.
 */

public class warningFragment extends Fragment {
    private static final String TAG = "warningsFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.warnings_tab,container,false);
        return view;
    }
}
