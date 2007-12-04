/* 
@ITMillApache2LicenseForJavaFiles@
 */

package com.itmill.toolkit.tests.featurebrowser;

import com.itmill.toolkit.ui.Component;
import com.itmill.toolkit.ui.Form;
import com.itmill.toolkit.ui.Label;
import com.itmill.toolkit.ui.OrderedLayout;

public class FeatureLabel extends Feature {

    public FeatureLabel() {
        super();
    }

    protected Component getDemoComponent() {

        final OrderedLayout l = new OrderedLayout();

        final Label lab = new Label("Label text");
        l.addComponent(lab);

        // Properties
        propertyPanel = new PropertyPanel(lab);
        final Form ap = propertyPanel.createBeanPropertySet(new String[] {
                "contentMode", "value" });
        ap.replaceWithSelect("contentMode", new Object[] {
                new Integer(Label.CONTENT_PREFORMATTED),
                new Integer(Label.CONTENT_TEXT),
                new Integer(Label.CONTENT_UIDL),
                new Integer(Label.CONTENT_XHTML),
                new Integer(Label.CONTENT_XML) },
                new Object[] { "Preformatted", "Text", "UIDL (Must be valid)",
                        "XHTML Fragment(Must be valid)",
                        "XML (Subtree with namespace)" });
        propertyPanel.addProperties("Label Properties", ap);

        setJavadocURL("ui/Label.html");

        return l;
    }

    protected String getExampleSrc() {
        return "Label l = new Label(\"Caption\");\n";
    }

    /**
     * @see com.itmill.toolkit.tests.featurebrowser.Feature#getDescriptionXHTML()
     */
    protected String getDescriptionXHTML() {
        return "Labels components are for captions and plain text. "
                + "By default, it is a light-weight component for presenting "
                + "text content in application, but it can be also used to present "
                + "formatted information and even XML."
                + "<br /><br />"
                + "Label can also be directly associated with data property to display "
                + "information from different data sources automatically. This makes it "
                + "trivial to present the current user in the corner of applications main window. "
                + "<br /><br />"
                + "On the demo tab you can try out how the different properties affect "
                + "the presentation of the component.";
    }

    protected String getImage() {
        return "icon_demo.png";
    }

    protected String getTitle() {
        return "Label";
    }

}
