package cqrs.mr.commands;

import java.util.UUID;

import cqrs.core.Command;

public class RemoveStockfromPortfolio extends Command {
	public UUID id;
	public final int count;
    public final int originalVersion;

    public RemoveStockfromPortfolio(UUID id, int count, int originalVersion) {
		this.id = id;
		this.count = count;
		this.originalVersion = originalVersion;
	}
}
