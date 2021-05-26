# codingz

Create Maven Project

```
mvn archetype:generate
    -DgroupId={project-packaging}
    -DartifactId={project-name}
    -DarchetypeArtifactId={maven-template}
    -DinteractiveMode=false
```
After adding the groupid and artifactid

```
mvn archetype:generate 
    -DgroupId=codingz 
    -DartifactId=codingz 
    -DarchetypeArtifactId=maven-archetype-quickstart  
    -DarchetypeVersion=1.4
    -DinteractiveMode=false
```