package org.codehaus.plexus;

import java.util.Set;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.metadata.ArtifactMetadataSource;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.resolver.ArtifactResolver;

/**
 * @author jdcasey
 * @version $Id$
 */
public interface ArtifactEnabledContainer
    extends PlexusContainer
{
    public void addComponent( Artifact component, ArtifactResolver artifactResolver, Set remoteRepositories,
        ArtifactRepository localRepository, ArtifactMetadataSource sourceReader, String[] groupExcludes )
        throws Exception;
}