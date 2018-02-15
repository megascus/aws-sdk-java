/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTaskAssessment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReplicationTaskAssessmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The assessed replication task.
     * </p>
     */
    private ReplicationTask replicationTask;

    /**
     * <p>
     * The assessed replication task.
     * </p>
     * 
     * @param replicationTask
     *        The assessed replication task.
     */

    public void setReplicationTask(ReplicationTask replicationTask) {
        this.replicationTask = replicationTask;
    }

    /**
     * <p>
     * The assessed replication task.
     * </p>
     * 
     * @return The assessed replication task.
     */

    public ReplicationTask getReplicationTask() {
        return this.replicationTask;
    }

    /**
     * <p>
     * The assessed replication task.
     * </p>
     * 
     * @param replicationTask
     *        The assessed replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskAssessmentResult withReplicationTask(ReplicationTask replicationTask) {
        setReplicationTask(replicationTask);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationTask() != null)
            sb.append("ReplicationTask: ").append(getReplicationTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReplicationTaskAssessmentResult == false)
            return false;
        StartReplicationTaskAssessmentResult other = (StartReplicationTaskAssessmentResult) obj;
        if (other.getReplicationTask() == null ^ this.getReplicationTask() == null)
            return false;
        if (other.getReplicationTask() != null && other.getReplicationTask().equals(this.getReplicationTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTask() == null) ? 0 : getReplicationTask().hashCode());
        return hashCode;
    }

    @Override
    public StartReplicationTaskAssessmentResult clone() {
        try {
            return (StartReplicationTaskAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}