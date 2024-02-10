package va92bg.dreamio.views.dream;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Dream")
@Route(value = "dream")
@AnonymousAllowed
@Uses(Icon.class)
public class DreamView extends Composite<VerticalLayout> {

    public DreamView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H1 h1 = new H1();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H2 h2 = new H2();
        H1 h12 = new H1();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Icon icon = new Icon();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Paragraph textLarge = new Paragraph();
        Paragraph textLarge2 = new Paragraph();
        ProgressBar progressBar = new ProgressBar();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        ComboBox comboBox = new ComboBox();
        ComboBox comboBox2 = new ComboBox();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        MenuBar menuBar = new MenuBar();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.addClassName(Padding.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        h1.setText("Title");
        h1.setWidth("max-content");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.setAlignItems(Alignment.CENTER);
        layoutRow2.setJustifyContentMode(JustifyContentMode.CENTER);
        h2.setText("Mood");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.CENTER, h2);
        h2.setWidth("max-content");
        h12.setText("Date");
        h12.setWidth("max-content");
        layoutRow3.addClassName(Gap.XSMALL);
        layoutRow3.addClassName(Padding.XSMALL);
        layoutRow3.setWidth("100%");
        layoutRow3.setMinWidth("100%");
        layoutRow3.setMaxWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.CENTER);
        icon.getElement().setAttribute("icon", "lumo:user");
        icon.setWidth("100%");
        icon.setMinWidth("50%");
        icon.setMaxWidth("100%");
        icon.setHeight("100%");
        icon.setMinHeight("50%");
        icon.setMaxHeight("100%");
        layoutColumn2.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        textLarge.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        textLarge.setWidth("100%");
        textLarge.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        textLarge2.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        textLarge2.setWidth("100%");
        textLarge2.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        progressBar.setValue(0.5);
        layoutRow4.addClassName(Gap.XLARGE);
        layoutRow4.addClassName(Padding.XSMALL);
        layoutRow4.setWidth("100%");
        layoutRow4.setHeight("min-content");
        layoutRow4.setAlignItems(Alignment.CENTER);
        layoutRow4.setJustifyContentMode(JustifyContentMode.CENTER);
        comboBox.setLabel("Art Style");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        comboBox2.setLabel("Interpret Origin");
        comboBox2.setWidth("min-content");
        setComboBoxSampleData(comboBox2);
        layoutRow5.setHeightFull();
        layoutRow4.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.addClassName(Padding.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.getStyle().set("flex-grow", "1");
        layoutRow5.setAlignItems(Alignment.CENTER);
        layoutRow5.setJustifyContentMode(JustifyContentMode.END);
        layoutRow5.setAlignSelf(FlexComponent.Alignment.END, menuBar);
        menuBar.setWidth("min-content");
        setMenuBarSampleData(menuBar);
        getContent().add(layoutRow);
        layoutRow.add(h1);
        layoutRow.add(layoutRow2);
        layoutRow2.add(h2);
        layoutRow.add(h12);
        getContent().add(layoutRow3);
        layoutRow3.add(icon);
        layoutRow3.add(layoutColumn2);
        layoutColumn2.add(textLarge);
        layoutColumn2.add(textLarge2);
        getContent().add(progressBar);
        getContent().add(layoutRow4);
        layoutRow4.add(comboBox);
        layoutRow4.add(comboBox2);
        layoutRow4.add(layoutRow5);
        layoutRow5.add(menuBar);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }
}
