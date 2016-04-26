To compile:

1. Download and install NetBeans (I tried before in Eclipse; didn't work)
2. Download the source code
3. Add the project in NetBeans
4. I got these errors:

- Problem: Project Problem: "JDOM" library could not be found, resolvable by: Resolver for LIBRARY libs.JDOM.classpath unresolved
- Problem: Project Problem: "DualRPC2" library could not be found, resolvable by: Resolver for LIBRARY libs.DualRPC2.classpath unresolved
-Problem: Project Problem: "OggVorbisSPI" library could not be found, resolvable by: Resolver for LIBRARY libs.OggVorbisSPI.classpath unresolved
- Problem: Project Problem: "JDK_1.5" platform could not be found, resolvable by: Resolver for PLATFORM JDK_1.5 unresolved

Solution:
- Point to your JDK (1.8 or whatever)
- Add the libraries are located under ..\InvadeEarth\web\
- Clean & Build

5. I got this error in InvadeEarth.java:

error: cannot find symbol import com.retrogui.dualrpc.common.CallException;

Solution: I believe it is missing dualrpc-common-2.0.2.jar

6. If JNLP throws "your security settings have blocked an application signed with an expired or not-yet-active certificate from running"
Solution: Add http://invadeearth.sourceforge.net as a security exception to Java Control Panel (Follow instructions from http://java.com/en/download/help/jcp_security.xml)



Links
* Old hosting location http://smileygames.net/invadeearth.1.html
* Lots of info about how the game works - http://smileygames.net/invadeearth/manual.html
* Jonathan's page http://jonathancrosmer.com/software/invadeearth/
* Google group - https://groups.google.com/forum/#!forum/smileyproductions
* FB group (more active, hosting games) - https://www.facebook.com/groups/428943173786372

Coding
* http://docs.oracle.com/javase/tutorial/deployment/deploymentInDepth/jnlp.html
* http://www.dreamincode.net/forums/topic/335212-problem-with-setting-up-a-project-in-netbeans/
