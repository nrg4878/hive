package org.apache.hadoop.hive.metastore.dataconnector;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hive.metastore.HiveMetaException;
import org.apache.hadoop.hive.metastore.api.DataConnector;
import org.apache.hadoop.hive.metastore.api.MetaException;
import org.apache.hadoop.hive.metastore.api.Table;

import java.net.ConnectException;
import java.util.List;
import java.util.Map;

/**
 * This interface provides a way for us to plugin different datasources into hive.
 * Each implementing class plugs in a new datasource type that the hive metastore can then call on
 * The implementing class understand the hive model objects and provide the translation between hive and the
 * native datasource.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface IDataConnectorProvider {
  DataConnector connector = null;

  /**
   * Opens a transport/connection to the datasource. Throws exception if the connection cannot be established.
   * @throws MetaException Throws MetaException if the connector does not have all info for a connection to be setup.
   * @throws java.net.ConnectException if the connection could not be established for some reason.
   */
  public void open() throws ConnectException, MetaException;

  /**
   * Closes a transport/connection to the datasource.
   * @throws ConnectException if the connection could not be closed.
   */
  public void close() throws ConnectException;

  /**
   * Set the scope of this object.
   */
  public void setScope(String databaseName);

  /**
   * Returns Hive Table objects from the remote database for tables that match a name pattern.
   * @return List A collection of objects that match the name pattern, null otherwise.
   * @throws MetaException To indicate any failures with executing this API
   */
  List<Table> getTables(String regex) throws MetaException;

  /**
   * Returns a list of all table names from the remote database.
   * @return List A collection of all the table names, null if there are no tables.
   * @throws MetaException To indicate any failures with executing this API
   */
  List<String> getTableNames() throws MetaException;

  /**
   * Fetch a single table with the given name, returns a Hive Table object from the remote database
   * @return Table A Table object for the matching table, null otherwise.
   * @throws MetaException To indicate any failures with executing this API
   */
  Table getTable(String tableName) throws MetaException;
}
