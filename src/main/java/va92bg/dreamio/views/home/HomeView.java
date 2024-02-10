package va92bg.dreamio.views.home;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import jakarta.annotation.security.PermitAll;

@PageTitle("Home")
@Route(value = "home")
@PermitAll
@Uses(Icon.class)
public class HomeView extends Composite<VerticalLayout> {

    public HomeView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        Button buttonPrimary3 = new Button();
        Button buttonPrimary4 = new Button();
        getContent().addClassName(Gap.XSMALL);
        getContent().addClassName(Padding.XSMALL);
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.addClassName(Gap.XSMALL);
        layoutColumn2.addClassName(Padding.XSMALL);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("50%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setMaxHeight("50%");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.addClassName(Padding.XSMALL);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("Record");
        layoutRow.setAlignSelf(FlexComponent.Alignment.END, buttonPrimary);
        buttonPrimary.getStyle().set("flex-grow", "1");
        buttonPrimary.setMinWidth("50%");
        buttonPrimary.setMaxWidth("50%");
        buttonPrimary.setHeight("100%");
        buttonPrimary.setMinHeight("50%");
        buttonPrimary.setMaxHeight("50%");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("New");
        layoutRow.setAlignSelf(FlexComponent.Alignment.END, buttonPrimary2);
        buttonPrimary2.getStyle().set("flex-grow", "1");
        buttonPrimary2.setMinWidth("50%");
        buttonPrimary2.setMaxWidth("50%");
        buttonPrimary2.setHeight("100%");
        buttonPrimary2.setMinHeight("50%");
        buttonPrimary2.setMaxHeight("50%");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow2.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.addClassName(Padding.XSMALL);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.setAlignItems(Alignment.CENTER);
        layoutRow2.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary3.setText("Calendar");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.START, buttonPrimary3);
        buttonPrimary3.setWidth("min-content");
        buttonPrimary3.setMinWidth("50%");
        buttonPrimary3.setMaxWidth("50%");
        buttonPrimary3.setMinHeight("50%");
        buttonPrimary3.setMaxHeight("50%");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary4.setText("Options");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.START, buttonPrimary4);
        buttonPrimary4.setWidth("min-content");
        buttonPrimary4.setMinWidth("50%");
        buttonPrimary4.setMaxWidth("50%");
        buttonPrimary4.setMinHeight("50%");
        buttonPrimary4.setMaxHeight("50%");
        buttonPrimary4.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutColumn2);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonPrimary2);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(buttonPrimary3);
        layoutRow2.add(buttonPrimary4);
    }
}
