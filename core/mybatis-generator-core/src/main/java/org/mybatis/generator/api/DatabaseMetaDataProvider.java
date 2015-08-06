package org.mybatis.generator.api;

import java.sql.DatabaseMetaData;

/**
 * Created by hulingwei on 2015/8/6.
 */
public interface DatabaseMetaDataProvider {
    DatabaseMetaData getMetaData();
}
