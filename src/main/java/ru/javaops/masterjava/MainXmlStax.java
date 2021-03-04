package ru.javaops.masterjava;

import com.google.common.io.Resources;
import ru.javaops.masterjava.xml.schema.ObjectFactory;
import ru.javaops.masterjava.xml.schema.Payload;
import ru.javaops.masterjava.xml.schema.Project;
import ru.javaops.masterjava.xml.schema.User;
import ru.javaops.masterjava.xml.util.JaxbParser;
import ru.javaops.masterjava.xml.util.StaxStreamProcessor;

import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MainXmlStax {

	public static final String XML = "payload_hw.xml";

	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			throw new IllegalArgumentException();
		}

		String projectName = args[0];

		StaxStreamProcessor staxStreamProcessor = new StaxStreamProcessor(Resources.getResource(XML).openStream());

		XMLStreamReader reader = staxStreamProcessor.getReader();

		boolean find = staxStreamProcessor.doUntil(XMLEvent.START_ELEMENT, "Group");

		while (reader.hasNext()) {

			int next = reader.next();
			String value = staxStreamProcessor.getValue(next);

			System.out.println(value);
		}

	}

}
