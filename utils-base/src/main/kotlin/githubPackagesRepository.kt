import com.eygraber.gradle.settings.GitHubPackagesRepositoryPlugin
import org.gradle.api.Action
import org.gradle.api.initialization.Settings
import org.gradle.kotlin.dsl.getByName

public fun Settings.gitHubPackagesRepository(
  action: Action<GitHubPackagesRepositoryPlugin.Extension>
) {
  action.execute(
    extensions.getByName<GitHubPackagesRepositoryPlugin.Extension>(
      "gitHubPackagesRepository"
    )
  )
}