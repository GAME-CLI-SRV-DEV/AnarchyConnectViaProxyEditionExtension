package org.geyser.extension.exampleid;

import org.geysermc.event.subscribe.Subscribe;
import org.geysermc.geyser.api.event.lifecycle.GeyserLoadResourcePacksEvent;
import org.geysermc.geyser.api.event.lifecycle.GeyserPostInitializeEvent;
import org.geysermc.geyser.api.extension.Extension;

import java.nio.file.Path;

// The main class of your extension - must implement extension, and be in the extension.yml file.
// see https://github.com/GeyserMC/Geyser/blob/master/api/src/main/java/org/geysermc/geyser/api/extension/Extension.java for more info on available methods
public class ExampleExtension implements Extension {

    // You can use the GeyserPostInitializeEvent to run anything after Geyser fully initialized and is ready to accept bedrock player connections.
    @Subscribe
    public void onPostInitialize(GeyserPostInitializeEvent event) {
        // example: show that your extension is loading.
        this.logger().info("AnarchyConnect(TM)");
        this.logger().info("The Ultimate Game System");
        this.logger().info("You Cannot BEAT US");
    }

}
