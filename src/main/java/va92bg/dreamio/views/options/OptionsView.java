package va92bg.dreamio.views.options;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Options")
@Route(value = "options")
@PermitAll
@Uses(Icon.class)
public class OptionsView extends Composite<VerticalLayout> {

    public OptionsView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H1 h1 = new H1();
        Hr hr = new Hr();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        Icon icon = new Icon();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        ComboBox comboBox = new ComboBox();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        ComboBox comboBox2 = new ComboBox();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        ComboBox comboBox3 = new ComboBox();
        Hr hr2 = new Hr();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        MenuBar menuBar = new MenuBar();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        h1.setText("Settings");
        h1.setWidth("max-content");
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow3.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        layoutRow4.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        icon.getElement().setAttribute("icon", "lumo:user");
        icon.setWidth("100%");
        icon.setHeight("100%");
        layoutColumn2.setHeightFull();
        layoutRow4.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.addClassName(Gap.XLARGE);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setHeight("100%");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        textField.setLabel("First Name");
        textField.setWidth("min-content");
        textField2.setLabel("Last Name");
        textField2.setWidth("min-content");
        comboBox.setLabel("Default Art Style");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        layoutColumn3.setHeightFull();
        layoutRow4.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.addClassName(Gap.XLARGE);
        layoutColumn3.setWidth("100%");
        layoutColumn3.setHeight("100%");
        layoutColumn3.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn3.setAlignItems(Alignment.CENTER);
        textField3.setLabel("Email");
        textField3.setWidth("min-content");
        textField4.setLabel("Phone Number");
        textField4.setWidth("min-content");
        comboBox2.setLabel("Default Interpretor Origin");
        comboBox2.setWidth("min-content");
        setComboBoxSampleData(comboBox2);
        layoutColumn4.setHeightFull();
        layoutRow4.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.addClassName(Gap.XLARGE);
        layoutColumn4.setWidth("100%");
        layoutColumn4.setHeight("100%");
        layoutColumn4.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn4.setAlignItems(Alignment.CENTER);
        textField5.setLabel("Empty Option");
        textField5.setWidth("min-content");
        textField6.setLabel("Empty Option 2");
        textField6.setWidth("min-content");
        comboBox3.setLabel("Default Melody Genre");
        comboBox3.setWidth("min-content");
        setComboBoxSampleData(comboBox3);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.setHeight("min-content");
        layoutRow5.setAlignItems(Alignment.CENTER);
        layoutRow5.setJustifyContentMode(JustifyContentMode.CENTER);
        menuBar.setWidth("min-content");
        setMenuBarSampleData(menuBar);
        getContent().add(layoutRow);
        layoutRow.add(h1);
        getContent().add(hr);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutRow3);
        layoutRow3.add(layoutRow4);
        layoutRow4.add(icon);
        layoutRow4.add(layoutColumn2);
        layoutColumn2.add(textField);
        layoutColumn2.add(textField2);
        layoutColumn2.add(comboBox);
        layoutRow4.add(layoutColumn3);
        layoutColumn3.add(textField3);
        layoutColumn3.add(textField4);
        layoutColumn3.add(comboBox2);
        layoutRow4.add(layoutColumn4);
        layoutColumn4.add(textField5);
        layoutColumn4.add(textField6);
        layoutColumn4.add(comboBox3);
        getContent().add(hr2);
        getContent().add(layoutRow5);
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
