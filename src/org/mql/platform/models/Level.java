package org.mql.platform.models;

/**
 * @author mehdithe
 */
public enum Level {

  M1("Premiere annee"),

  M2("Deuxieme annee");

  private String representation;

  Level(String representation) {
    this.representation = representation;
  }

  public String getRepresentation() {
    return representation;
  }

  public void setRepresentation(String representation) {
    this.representation = representation;
  }
}
