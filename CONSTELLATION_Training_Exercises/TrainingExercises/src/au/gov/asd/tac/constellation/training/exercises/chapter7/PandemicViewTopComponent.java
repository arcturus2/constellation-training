/*
 * Copyright 2010-2019 Australian Signals Directorate
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package au.gov.asd.tac.constellation.training.exercises.chapter7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Properties;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

/**
 * Improved Pandemic View Top Component.
 */
//@ConvertAsProperties(
//        dtd = "-//au.gov.asd.tac.constellation.training.exercises.chapter7//PandemicView//EN",
//        autostore = false)
//@TopComponent.Description(
//        preferredID = "PandemicViewTopComponent",
//        iconBase = "au/gov/asd/tac/constellation/training/exercises/chapter7/biohazard.png",
//        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
//@TopComponent.Registration(
//        mode = "explorer",
//        openAtStartup = false)
//@ActionID(
//        category = "Window",
//        id = "au.gov.asd.tac.constellation.training.exercises.chapter7.PandemicViewTopComponent")
//@ActionReferences({
//    @ActionReference(path = "Menu/Views", position = 2000),
//    @ActionReference(path = "Shortcuts", name = "CS-Y")})
//@TopComponent.OpenActionRegistration(
//        displayName = "#CTL_PandemicViewAction",
//        preferredID = "PandemicViewTopComponent")
@Messages({
    "CTL_PandemicViewAction=Pandemic View",
    "CTL_PandemicViewTopComponent=Pandemic View",
    "HINT_PandemicViewTopComponent=Pandemic View"})
public final class PandemicViewTopComponent extends TopComponent {

    public PandemicViewTopComponent() {
        initComponents();
        setName(Bundle.CTL_PandemicViewTopComponent());
        setToolTipText(Bundle.HINT_PandemicViewTopComponent());

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 500));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
    }

    @Override
    public void componentClosed() {
    }

    void writeProperties(final Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(final Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}