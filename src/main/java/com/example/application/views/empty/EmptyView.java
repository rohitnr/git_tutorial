package com.example.application.views.empty;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.example.application.views.empty.EmptyView.EmptyViewModel;
import com.example.application.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "empty", layout = MainView.class)
@PageTitle("Empty")
@JsModule("./src/views/empty/empty-view.js")
@Tag("empty-view")
@RouteAlias(value = "", layout = MainView.class)
public class EmptyView extends PolymerTemplate<EmptyViewModel> {

    // This is the Java companion file of a design
    // You can find the design file in /frontend/src/views/src/views/empty/empty-view.js
    // The design can be easily edited by using Vaadin Designer (vaadin.com/designer)

    public static interface EmptyViewModel extends TemplateModel {
    }

    public EmptyView() {
    }
}
