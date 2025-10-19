import * as vscode from 'vscode';

export function activate(context: vscode.ExtensionContext) {
  const disposable = vscode.commands.registerCommand('code-learn.helloWorld', () => {
    vscode.window.showInformationMessage('Hello World!!!');
  });

  context.subscriptions.push(disposable);

  // 可以注册新的命令
  // NOTE 这里需要注意, 如果需要注册新的命令, 则需要在 package.json 中也配置命令, 否则无效
  context.subscriptions.push(
    vscode.commands.registerCommand('code-learn.helloWorldWarn', () => {
      // 可以使用别的API, 比如展示警告信息
      vscode.window.showWarningMessage('这是一条警告信息', {
        detail: '这是详细信息',
      });
    }),
  );
}

export function deactivate() {}
