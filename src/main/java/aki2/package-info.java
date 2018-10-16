@OSGiBundle(
    name="aki1",
    symbolicName="jaki1.aki1",
    version="1.0-SNAPSHOT"
)
@OSGiImportPackages({
    "org.osgi.framework"
})
@OSGiExportPackage
package aki2;

import org.nakedosgi.annotations.OSGiBundle;
import org.nakedosgi.annotations.OSGiExportPackage;
import org.nakedosgi.annotations.OSGiImportPackages;

