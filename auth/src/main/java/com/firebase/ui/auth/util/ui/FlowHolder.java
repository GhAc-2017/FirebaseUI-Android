package com.firebase.ui.auth.util.ui;

import android.app.Application;
import android.support.annotation.RestrictTo;

import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.viewmodel.ViewModelBase;

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
public class FlowHolder extends ViewModelBase<FlowParameters> {
    public FlowHolder(Application application) {
        super(application);
    }

    @Override
    public FlowParameters getArguments() {
        return super.getArguments();
    }
}