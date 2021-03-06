package com.github.andbed.cleanarch.eventtype.core.entity;

import java.util.List;
import java.util.stream.Collectors;

import com.github.andbed.cleanarch.eventtype.core.boundary.provide.EventTypeFullResponseModel;
import com.github.andbed.cleanarch.eventtype.core.boundary.provide.EventTypeShortResponseModel;

public abstract class EventType {

	public abstract Long getId();

	public abstract String getName();

	public abstract List<EventAttribute> getAttributes();

	public abstract boolean isVisible();

	public void calculateInheritedAttributes() {
	}

	public EventTypeShortResponseModel toShortEventType() {
		return new EventTypeShortResponseModel()
				.setName(getName())
				.setId(getId());
	}

	public EventTypeFullResponseModel toFullEventType() {
		return new EventTypeFullResponseModel()
				.setName(getName())
				.setId(getId())
				.setAttributeNames(getAttributes().stream()
						.map(a -> a.getName())
						.collect(Collectors.toList()));
	}

}