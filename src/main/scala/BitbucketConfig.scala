package io.yard.module.bitbucket
package utils

trait BitbucketConfig extends io.yard.common.utils.Config {
  object bitbucket {
    object bot {
      def name = config.getString("yardio.bitbucket.bot.name")
      def icon = config.getString("yardio.bitbucket.bot.icon")
    }
  }
}
