package dev.ricknout.rugbyranker.live.work

import android.content.Context
import androidx.hilt.Assisted
import androidx.hilt.work.WorkerInject
import androidx.work.WorkManager
import androidx.work.WorkerParameters
import dev.ricknout.rugbyranker.core.model.Sport
import dev.ricknout.rugbyranker.match.data.MatchRepository

class WomensLiveMatchWorker @WorkerInject constructor(
    @Assisted appContext: Context,
    @Assisted params: WorkerParameters,
    repository: MatchRepository,
    workManager: WorkManager
) : LiveMatchWorker(appContext, params, Sport.WOMENS, repository, workManager) {

    companion object {
        fun getUniqueWorkName(matchId: Long) = "live_match_worker_womens_$matchId"
    }
}
