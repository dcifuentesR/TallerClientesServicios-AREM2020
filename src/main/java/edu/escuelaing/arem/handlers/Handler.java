package edu.escuelaing.arem.handlers;

import java.io.OutputStream;
import java.io.PrintWriter;

public interface Handler {
	public void handle(PrintWriter out, OutputStream outStream, String request);

}
