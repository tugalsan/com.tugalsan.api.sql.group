package com.tugalsan.api.sql.group.server;

import com.tugalsan.api.list.client.*;
import com.tugalsan.api.sql.sanitize.server.*;
import com.tugalsan.api.string.client.*;
import java.util.*;

public class TS_SQLGroup {

    public TS_SQLGroup() {
    }
    public List<String> columnNames = TGS_ListUtils.of();

    @Override
    public String toString() {
        if (columnNames.isEmpty()) {
            return "";
        }
        TS_SQLSanitizeUtils.sanitize(columnNames);
        return TGS_StringUtils.concat("GROUP BY ", TGS_StringUtils.toString(columnNames, ","));
    }
}
