package de.fraunhofer.isst.dataspaceconnector.controller.v2;

import de.fraunhofer.isst.dataspaceconnector.model.OfferedResource;
import de.fraunhofer.isst.dataspaceconnector.model.view.OfferedResourceView;
import de.fraunhofer.isst.dataspaceconnector.services.resources.v2.backend.AbstractCatalogResourceLinker;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catalogs/{id}/resources")
@Tag(name = "Linker", description = "Endpoints for linking a base resource and its children")
public class CatalogOfferedResources extends BaseResourceChildController<AbstractCatalogResourceLinker<OfferedResource>, OfferedResource, OfferedResourceView> {
}
