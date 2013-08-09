package net.chakrit.android.dummy;

import dagger.ObjectGraph;

import java.util.ArrayList;
import java.util.List;

public class ObjectGraphBuilder {
    public static final List<Object> modules = new ArrayList<Object>();

    public static ObjectGraph buildObjectGraph() {
        return ObjectGraph.create(new SdkCoreModule()).plus(modules.toArray());
    }
}
