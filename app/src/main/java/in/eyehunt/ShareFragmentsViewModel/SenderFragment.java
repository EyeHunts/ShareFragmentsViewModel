package in.eyehunt.ShareFragmentsViewModel;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SenderFragment extends Fragment {
    private SharedViewModel model;

    public SenderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sender, container, false);
        model = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);

        Button button = (Button) view.findViewById(R.id.btn_sender);
        // on click button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.setMessage("Hello Fragment i am Sender - ViewModel");
            }
        });
        return view;
    }

}
