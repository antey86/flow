/* 
@ITMillApache2LicenseForJavaFiles@
 */

package com.itmill.toolkit.tests.featurebrowser;

import com.itmill.toolkit.ui.Component;
import com.itmill.toolkit.ui.Form;
import com.itmill.toolkit.ui.Label;
import com.itmill.toolkit.ui.OrderedLayout;
import com.itmill.toolkit.ui.Panel;
import com.itmill.toolkit.ui.Select;

public class IntroLayouts extends Feature {

    private static final String INTRO_TEXT = ""
            + "Layouts are required to place components to specific place in the UI."
            + " You can use plain Java to accomplish sophisticated component layouting."
            + " Other option is to use Custom Layout and let the web page designers"
            + " to take responsibility of component layouting using their own set of tools."
            + "<br /><br />See API documentation below for more information.";

    public IntroLayouts() {
        super();
    }

    protected Component getDemoComponent() {

        final OrderedLayout l = new OrderedLayout();

        final Panel panel = new Panel();
        panel.setCaption("Layouts");
        l.addComponent(panel);

        final Label label = new Label();
        panel.addComponent(label);

        label.setContentMode(Label.CONTENT_XHTML);
        label.setValue(INTRO_TEXT);

        // Properties
        propertyPanel = new PropertyPanel(panel);
        final Form ap = propertyPanel.createBeanPropertySet(new String[] {
                "width", "height" });
        final Select themes = (Select) propertyPanel.getField("style");
        themes.addItem("light").getItemProperty(
                themes.getItemCaptionPropertyId()).setValue("light");
        themes.addItem("strong").getItemProperty(
                themes.getItemCaptionPropertyId()).setValue("strong");
        propertyPanel.addProperties("Panel Properties", ap);

        setJavadocURL("ui/Layout.html");

        return l;
    }

    protected String getExampleSrc() {
        return null;
    }

    /**
     * @see com.itmill.toolkit.tests.featurebrowser.Feature#getDescriptionXHTML()
     */
    protected String getDescriptionXHTML() {
        return null;
    }

    protected String getImage() {
        return null;
    }

    protected String getTitle() {
        return null;
    }

}
