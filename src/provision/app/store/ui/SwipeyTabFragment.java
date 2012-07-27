package provision.app.store.ui;

import provision.app.store.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SwipeyTabFragment extends Fragment {
    
	@Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        setUserVisibleHint(true);
    }
    
        public static Fragment newInstance(String title) {
                SwipeyTabFragment f = new SwipeyTabFragment();
                Bundle args = new Bundle();
                args.putString("title", title);
                f.setArguments(args);
                return f;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                        Bundle savedInstanceState) {
                ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_swipeytab, null);
                final String title = getArguments().getString("title");
                ((TextView) root.findViewById(R.id.text)).setText(title);
                return root;
        }

}