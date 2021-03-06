/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.extension.distribution.internal.job;

import java.util.List;

import org.xwiki.extension.distribution.internal.job.step.DistributionStep;
import org.xwiki.job.event.status.JobStatus;
import org.xwiki.logging.LoggerManager;
import org.xwiki.observation.ObservationManager;

/**
 * @version $Id$
 * @since 5.0M1
 * @deprecated since 9.1RC1, use {@link DistributionJobStatus} instead
 */
@Deprecated
public class WikiDistributionJobStatus extends DistributionJobStatus
{
    /**
     * Serialization identifier.
     */
    private static final long serialVersionUID = 1L;

    public WikiDistributionJobStatus(DistributionRequest request, ObservationManager observationManager,
        LoggerManager loggerManager, List<DistributionStep> steps)
    {
        super(request, observationManager, loggerManager, steps);
    }

    public WikiDistributionJobStatus(JobStatus status, ObservationManager observationManager,
        LoggerManager loggerManager)
    {
        super(status, observationManager, loggerManager);
    }
}
