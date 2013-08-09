package net.chakrit.android.dummy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import dagger.ObjectGraph;

import javax.inject.Inject;

public class MainActivity extends Activity {
    @Inject DataObject obj;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObjectGraphBuilder.modules.add(new AppModuleONE());
        ObjectGraphBuilder.modules.add(new AppModuleTWO());

        ObjectGraph graph = ObjectGraphBuilder.buildObjectGraph();
        graph.inject(this);

        Button test = (Button) findViewById(R.id.button_test);
        test.setText(obj.getClass().getName());
    }
}
