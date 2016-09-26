package org.eclipse.smarthome.io.rest.urc;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.eclipse.smarthome.core.thing.ThingRegistry;
import org.eclipse.smarthome.io.rest.RESTResource;
import org.eclipse.smarthome.io.rest.core.thing.Api;
import org.eclipse.smarthome.io.rest.LocaleUtil;
import org.eclipse.smarthome.io.rest.RESTResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * This class acts as a REST resource for things and is registered with the
 * Jersey servlet.
 *
 * @author Lukas Smirek - Initial contribution
 */

@Path(UrcInterfaceResource.urc_interface_path)
@Api(value = UrcInterfaceResource.urc_interface_path)
public class URCInterfaceResource implements RESTResource {

    // private final Logger logger = LoggerFactory.getLogger(ThingResource.class);

    /** The URI path to this resource */
    public static final String urc_interface_path = "urcInterfaces";

    // private ThingRegistry thingRegistry;

    @Context
    private UriInfo uriInfo;

    protected void setThingRegistry(ThingRegistry thingRegistry) {
        this.thingRegistry = thingRegistry;
    }

    protected void unsetThingRegistry(ThingRegistry thingRegistry) {
        this.thingRegistry = null;
    }

    @GET
    public UrcInterfacesList getUrcInterFaces() {
    '    UrcInterfacesList urcInterfacesList = new UrcInterfacesList();
        InterfaceInformation info = new InterfaceInformation();
        info.setTitel("Hello world");
        info.setTarget("testTarget");

        urcInterfacesList.addUrcInterface(info);
        return urcInterfacesList;
    }

}