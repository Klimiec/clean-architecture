package com.github.andbed.cleanarch.eventtype.core.boundary;

import com.github.andbed.cleanarch.common.MessageCode;

public interface ImportPresenter {

	void sendMessage(MessageCode xmlNotValid);

	void sendResult(boolean result);

}