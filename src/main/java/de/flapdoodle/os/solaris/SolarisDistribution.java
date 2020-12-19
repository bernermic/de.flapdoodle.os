package de.flapdoodle.os.solaris;

import de.flapdoodle.os.Distribution;
import de.flapdoodle.os.Version;
import de.flapdoodle.os.common.Peculiarity;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public enum SolarisDistribution implements Distribution {
	;

	@Override
	public List<Peculiarity<?>> pecularities() {
		return Collections.emptyList();
	}

	@Override
	public List<Version> versions() {
		return Collections.emptyList();
	}
}
