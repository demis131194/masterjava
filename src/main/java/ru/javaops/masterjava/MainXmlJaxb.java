package ru.javaops.masterjava;

import com.google.common.io.Resources;
import ru.javaops.masterjava.xml.schema.*;
import ru.javaops.masterjava.xml.util.JaxbParser;

import java.util.*;
import java.util.stream.Collectors;

public class MainXmlJaxb {

	public static final String XML = "payload_hw.xml";

	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			throw new IllegalArgumentException();
		}

		String projectName = args[0];

		JaxbParser jaxbParser = new JaxbParser(ObjectFactory.class);

		Payload payload = jaxbParser.unmarshal(Resources.getResource(XML).openStream());
		List<Project> projects = payload.getProjects().getProject();
		Project project = projects.stream().filter(proj -> projectName.equals(proj.getName())).findFirst().orElseThrow(Exception::new);

		TreeSet<User> collect = project.getGroup()
									   .stream()
									   .flatMap(group -> group.getUserRef().stream())
									   .map(userRef -> (User) userRef.getUserRef())
									   .collect(Collectors.toCollection(TreeSet::new));

		collect.forEach(user -> System.out.println(user.getFullName()));


	}

}
